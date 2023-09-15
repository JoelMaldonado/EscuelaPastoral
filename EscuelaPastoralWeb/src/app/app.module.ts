import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './ui/pages/login/login.component';
import { CajatextoComponent } from './ui/components/cajatexto/cajatexto.component';
import { MenuComponent } from './ui/pages/menu/menu.component';
import { FormularioComponent } from './ui/pages/formulario/formulario.component';

import { CajaselectComponent } from './ui/components/cajaselect/cajaselect.component';
import { CajadataComponent } from './ui/components/cajadata/cajadata.component';
import { NotificacionesComponent } from './ui/components/notificaciones/notificaciones.component';



import { SidenavComponent } from './ui/components/sidenav/sidenav.component';
import { BtnarchivoComponent } from './ui/components/btnarchivo/btnarchivo.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    CajatextoComponent,
    MenuComponent,
    FormularioComponent,

    CajaselectComponent,
    CajadataComponent,
    NotificacionesComponent ,
    SidenavComponent,
    BtnarchivoComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
