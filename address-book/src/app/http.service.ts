import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { contacts } from './contacts.model';

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  baseUrl: string = "http://localhost:5555/api/getallcontacts";

  constructor(private http: HttpClient) { }

  getAllContacts(): Observable<contacts[]>{

    return this.http.get<contacts[]>(this.baseUrl);

  }
}
