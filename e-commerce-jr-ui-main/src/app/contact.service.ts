import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
imports: [
HttpClientModule
],

providers: [
  ContactService
  ],

@Injectable({
  providedIn: 'root'
})
export class ContactService {

  private api = 'Http://mailthis.to/alias' 
  
  constructor(private http: HttpClient){ }

  PostMessage(input: any) {
    return this.http.post(this.api, input, {responseType: 'text'}).pipe(
      map(
        (response)=> {
          if (response) {
            return response;
          }
        },
  (error: any)=>{
    return error;
  }
  )
  )
  }
}
