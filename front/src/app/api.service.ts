import { HttpClient } from '@angular/common/http';
import { Injectable, inject } from '@angular/core';
import { Observable } from 'rxjs';
import { Usuario } from './usuarios/interfaces/usuario.interface';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private baseUrl ="http://localhost/api";

  private http = inject(HttpClient);
  

  getAllUsarios():Observable<Usuario[]>{
    return this.http.get<Usuario[]>(`${this.baseUrl}/main/getAllUsuarios`);
    
  }
}
