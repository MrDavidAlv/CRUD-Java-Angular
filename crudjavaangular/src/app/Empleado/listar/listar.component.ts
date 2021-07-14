import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService} from '../../Service/service.service';
import { Empleado } from 'src/app/Modelo/Empleado';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {

  empleados:Empleado[] | undefined;
  service: any;
  personas: any;

  constructor(private http:ServiceService, private router:Router) { }

  ngOnInit(): void {
    this.service.getEmpleados()
    .subscribe((data: any)=>{
      this.personas=data;
    })
  }

}
