import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Empleado } from '../Modelo/Empleado';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {


  constructor(private http:HttpClient) { }

  //Referencia al Backend
  Url = 'http://localhost:8080/crudjavaangular/empleados';

  getEmpleados(){
    return this.http.get<Empleado[]>(this.Url);
  }
  createEmpleado(empleado:Empleado){
    return this.http.post<Empleado>(this.Url,empleado);
  }

}
