import { Component, OnInit } from '@angular/core';
import { Department } from './Department';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  prompt1='Enter Username';
  prompt2='Enter Password';
  uname='Pavan';
  upass='iamgr8';
  isLoggedIn=false;
  allDepts=["Testing","Accounting","Coading","Sales"];//it is jst an array of strings
  dept: Department = new Department();// it s an object
  deptAry: Department[] = [
    {
      "departmentNumber": 30,
      "departmentName": "SALES",
      "departmentLocation": "CHICAGO",
      "empSet": [
          {
              "employeeNumber": 7844,
              "employeeName": "TURNER",
              "employeeJob": "SALESMAN",
              "employeeManager": 7698,
              "employeeHireDate": "1981-09-08",
              "employeeSalary": 1500.0,
              "employeeCommission": 0.0,
              "custList": [
                  {
                      "customerid": 105,
                      "name": "K + T SPORTS",
                      "city": "SANTA CLARA",
                      "creditlimit": 5000.0
                  },
                  {
                      "customerid": 108,
                      "name": "NORTH WOODS HEALTH AND FITNESS SUPPLY CENTER",
                      "city": "HIBBING",
                      "creditlimit": 8000.0
                  },
                  {
                      "customerid": 100,
                      "name": "JOCKSPORTS",
                      "city": "BELMONT",
                      "creditlimit": 5000.0
                  }
              ]
          },
          {
              "employeeNumber": 7521,
              "employeeName": "WARD",
              "employeeJob": "SALESMAN",
              "employeeManager": 7698,
              "employeeHireDate": "1981-02-22",
              "employeeSalary": 1250.0,
              "employeeCommission": 500.0,
              "custList": [
                  {
                      "customerid": 101,
                      "name": "TKB SPORT SHOP",
                      "city": "REDWOOD CITY",
                      "creditlimit": 10000.0
                  },
                  {
                      "customerid": 103,
                      "name": "JUST TENNIS",
                      "city": "BURLINGAME",
                      "creditlimit": 3000.0
                  },
                  {
                      "customerid": 106,
                      "name": "SHAPE UP",
                      "city": "PALO ALTO",
                      "creditlimit": 6000.0
                  }
              ]
          },
          {
              "employeeNumber": 7499,
              "employeeName": "ALLEN",
              "employeeJob": "SALESMAN",
              "employeeManager": 7698,
              "employeeHireDate": "1981-02-20",
              "employeeSalary": 1600.0,
              "employeeCommission": 300.0,
              "custList": [
                  {
                      "customerid": 104,
                      "name": "EVERY MOUNTAIN",
                      "city": "CUPERTINO",
                      "creditlimit": 10000.0
                  },
                  {
                      "customerid": 107,
                      "name": "WOMENS SPORTS",
                      "city": "SUNNYVALE",
                      "creditlimit": 10000.0
                  }
              ]
          },
          {
              "employeeNumber": 7698,
              "employeeName": "BLAKE",
              "employeeJob": "MANAGER",
              "employeeManager": 7839,
              "employeeHireDate": "1981-05-01",
              "employeeSalary": 2850.0,
              "employeeCommission": undefined,
              "custList": []
          },
          {
              "employeeNumber": 7654,
              "employeeName": "MARTIN",
              "employeeJob": "SALESMAN",
              "employeeManager": 7698,
              "employeeHireDate": "1981-09-28",
              "employeeSalary": 1250.0,
              "employeeCommission": 1400.0,
              "custList": [
                  {
                      "customerid": 102,
                      "name": "VOLLYRITE",
                      "city": "BURLINGAME",
                      "creditlimit": 7000.0
                  }
              ]
          }
      ]
  }
  ];
  ngOnInit(): void {
    this.dept.departmentNumber=10;
    this.dept.departmentName='Accounting';
    this.dept.departmentLocation='NewYork';
  }
  //Account ary[]= new Account[4];
  //ary[0]=new Account(); 
  //ary[1]=new Account();
  //ary[2]=new Account();
  //ary[3]=new Account();


  mySignInFunction(){
    alert('signin is clicked');
  }
  constructor() { }



}
