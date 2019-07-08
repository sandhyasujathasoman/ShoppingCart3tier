import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { User } from '../models/user';

@Injectable()
export class UserService {
    constructor(private http: HttpClient) { }

    getAll() {
        return this.http.get<User[]>(`http://myspringapp-springbootdemoapps.apps.cdeocp.com/users`);
    }

    register(user: User) {
        return this.http.post(`http://myspringapp-springbootdemoapps.apps.cdeocp.com/users/register`, user);
    }

    delete(id: number) {
        return this.http.delete(`http://myspringapp-springbootdemoapps.apps.cdeocp.com/users/${id}`);
    }
}