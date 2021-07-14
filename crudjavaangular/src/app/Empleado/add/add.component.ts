import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Empleado } from 'src/app/Modelo/Empleado';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit(): void {
  }
  Guardar(empleado:Empleado){
    this.service.createEmpleado(empleado)
    .subscribe( (data: any)=>{
      alert("Se agrego con Exito...!!!");
      this.router.navigate(["listar"])
    })

  }

}
