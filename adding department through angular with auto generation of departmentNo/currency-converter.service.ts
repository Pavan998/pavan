import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Department, DepartmentDTO } from './login/Department';

@Injectable({
  providedIn: 'root'
})
export class CurrencyConverterService {

  constructor(private myHttp: HttpClient) { }
  convert(){
    alert('currency converter alert is invoked');
  }
  connectCurrencyServer(){
    alert('connectCurrencyServer  alert is invoked');
  }
  connectMarketPlace(){
    alert(' connectMarketPlace  alert is invoked');
  }
  updateCurreencies(){
    alert('updateCurreencies alert is invoked');
  }
  findDepartmentByDeptnoService(dno: number): Observable<Department> {
    return this.myHttp.get<Department>("http://localhost:8080/getDept/"+dno);
     
}

addDepartmentService(dept: Department)  {
  return this.myHttp.post("http://localhost:8080/addDept",dept,{responseType:'text'});
   
}
}
