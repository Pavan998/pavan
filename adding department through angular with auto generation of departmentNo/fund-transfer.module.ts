import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddPayeeComponent } from './add-payee/add-payee.component';
import { ViewPayeeComponent } from './view-payee/view-payee.component';
import { ViewAllPayeeComponent } from './view-all-payee/view-all-payee.component';
import { DeletePayeeComponent } from './delete-payee/delete-payee.component';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    AddPayeeComponent,
    ViewPayeeComponent,
    ViewAllPayeeComponent,
    DeletePayeeComponent
  ],
  imports: [
    CommonModule,
    BrowserModule,
    FormsModule
  ],
  exports: [
    AddPayeeComponent,
    DeletePayeeComponent,
    ViewAllPayeeComponent,
    ViewPayeeComponent
  ]
})
export class FundTransferModule { }
