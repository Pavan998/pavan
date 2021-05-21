import { Component, OnInit } from '@angular/core';
import { CurrencyConverterService } from 'src/app/currency-converter.service';
import { Department, DepartmentDTO } from 'src/app/login/Department';

@Component({
  selector: 'app-add-payee',
  templateUrl: './add-payee.component.html',
  styleUrls: ['./add-payee.component.css']
})
export class AddPayeeComponent implements OnInit {
mydept:Department=new Department();
mydept1:Department=new Department();
mydept2:Department=new Department();
  constructor(private ccs:CurrencyConverterService) { }

  ngOnInit(): void {
  }
  addDepartment(dept:Department){
    this.ccs.addDepartmentService(dept).subscribe((data)=>{
      if(data!=null){
        alert("adding is successful");
      }},
      (err)=>{
        alert("some thing went wrong");
        console.log(err);
      }
    
    )

  }


  modifyDepartment(dept:Department){
    this.ccs.modifyDepartmentService(dept).subscribe((data)=>{
      if(data!=null){
        alert("Modification successful");
      }},
      (err)=>{
        alert("some thing went wrong");
        console.log(err);
      }
    
    )

  }

  deleteDepartment(dept:Department){
    this.ccs.deleteDepartmentService(dept).subscribe((data)=>{
      if(data!=null){
        alert("Deleted successful");
      }},
      (err)=>{
        alert("some thing went wrong");
        console.log(err);
      }
    
    )

  }
}
