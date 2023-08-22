import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatIconModule } from '@angular/material/icon';
import { MatTableModule } from '@angular/material/table';
import {MatDividerModule} from '@angular/material/divider';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatMenuModule} from '@angular/material/menu';
import {MatListModule} from '@angular/material/list';
import {MatSidenavModule} from '@angular/material/sidenav';
import { VerAlumnosComponent } from './components/ver-alumnos/ver-alumnos.component';
import { VerMaestrosComponent } from './components/ver-maestros/ver-maestros.component';
import { VerCursosComponent } from './components/ver-cursos/ver-cursos.component';
import { VerEventosComponent } from './components/ver-eventos/ver-eventos.component';
import { MenuComponent } from './components/menu/menu.component';
import {MatCardModule} from '@angular/material/card';
import { ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    VerAlumnosComponent,
    VerMaestrosComponent,
    VerCursosComponent,
    VerEventosComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatInputModule,
    MatFormFieldModule,
    MatIconModule,
    MatTableModule,
    MatDividerModule,
    MatToolbarModule,
    MatMenuModule,
    MatListModule,
    MatSidenavModule,
    MatCardModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
