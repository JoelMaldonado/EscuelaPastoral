import { Component } from '@angular/core';
import { FormControl } from '@angular/forms';
import { MatTableDataSource } from '@angular/material/table';
import { Alumno } from 'src/app/interfaces/alumno';

@Component({
  selector: 'app-ver-alumnos',
  templateUrl: './ver-alumnos.component.html',
  styleUrls: ['./ver-alumnos.component.css']
})
export class VerAlumnosComponent {

  displayedColumns: string[] = ['id', 'nombre', 'edad', 'genero', 'acciones'];
  dataSource = new MatTableDataSource<Alumno>(ALUMNOS);

  agregarAlumno() {
    const nuevoId = this.dataSource.data.length + 1;
    const nuevoAlumno: Alumno = {
      id: nuevoId,
      nombre: `Nuevo Alumno ${nuevoId}`,
      edad: Math.floor(Math.random() * 10) + 18,
      genero: Math.random() > 0.5 ? 'Masculino' : 'Femenino'
    };
    this.dataSource.data.push(nuevoAlumno);
    this.dataSource._updateChangeSubscription();
  }
  
}

const ALUMNOS: Alumno[] = [
  { id: 1, nombre: 'Juan Pérez', edad: 20, genero: 'Masculino' },
  { id: 2, nombre: 'María Gómez', edad: 22, genero: 'Femenino' },
  { id: 3, nombre: 'Carlos Rodríguez', edad: 21, genero: 'Masculino' },
  // Agrega más alumnos aquí
];
