import { Component, inject, OnInit } from '@angular/core';
import { ApiService } from '../api.service';
import { Usuario } from './interfaces/usuario.interface';

@Component({
  selector: 'app-usuarios',
  standalone: true,
  imports: [],
  templateUrl: './usuarios.component.html',
  styleUrl: './usuarios.component.css'
})
export default class UsuariosComponent implements OnInit {
  
  private apiService = inject(ApiService);
  usuarios : Usuario[] = [];
  
  ngOnInit(): void {
   this.apiService.getAllUsarios().subscribe( usuarios =>{
    this.usuarios = usuarios;
   });
  }


}
