import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { AlertService } from '../services/alert-service.service';
import { User } from '../models/user';

@Injectable()
export class AuthenticationService {
    private currentUserSubject: BehaviorSubject<User>;
    public currentUser: Observable<User>;
    private alertService: AlertService
    constructor(private http: HttpClient) {
        this.currentUserSubject = new BehaviorSubject<User>(JSON.parse(localStorage.getItem('currentUser')));
        this.currentUser = this.currentUserSubject.asObservable();
        
    }

    public get currentUserValue(): User {
        return this.currentUserSubject.value;
    }

    login(username, password) {
        return this.http.post<any>(`http://myspringapp-springbootdemoapps.apps.cdeocp.com/users/authenticate`, { username, password })
            .pipe(map(user => {
                this.alertService.success('Login successful', true);
                // store user details and jwt token in local storage to keep user logged in between page refreshes
                localStorage.setItem('currentUser', JSON.stringify(user));
                this.currentUserSubject.next(user);
                return user;
            }));
    }

    logout() {
        // remove user from local storage and set current user to null
        localStorage.removeItem('currentUser');
        this.currentUserSubject.next(null);
    }
}