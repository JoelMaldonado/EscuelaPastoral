import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './ui/pages/login/login.component';
import { CajatextoComponent } from './ui/components/cajatexto/cajatexto.component';
import { MenuComponent } from './ui/pages/menu/menu.component';
import { FormularioComponent } from './ui/pages/formulario/formulario.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    CajatextoComponent,
    MenuComponent,
    FormularioComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
