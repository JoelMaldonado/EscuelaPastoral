import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { VerAlumnosComponent } from './components/ver-alumnos/ver-alumnos.component';
import { VerMaestrosComponent } from './components/ver-maestros/ver-maestros.component';
import { VerCursosComponent } from './components/ver-cursos/ver-cursos.component';
import { VerEventosComponent } from './components/ver-eventos/ver-eventos.component';

const routes: Routes = [
  { path: 'alumno', component: VerAlumnosComponent },
  { path: 'maestro', component: VerMaestrosComponent },
  { path: 'curso', component: VerCursosComponent },
  { path: 'evento', component: VerEventosComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
