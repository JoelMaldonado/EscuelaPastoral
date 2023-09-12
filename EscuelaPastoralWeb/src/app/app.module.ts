import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SelectComponent } from './ui/components/select/select.component';
import { MenuComponent } from './ui/pages/menu/menu.component';
import { LoginComponent } from './ui/pages/login/login.component';
import { FormularioComponent } from './ui/pages/formulario/formulario.component';

@NgModule({
  declarations: [
    AppComponent,
    SelectComponent,
    MenuComponent,
    LoginComponent,
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
