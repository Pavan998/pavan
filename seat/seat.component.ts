import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-seat',
  templateUrl: './seat.component.html',
  styleUrls: ['./seat.component.css']
})
export class SeatComponent implements OnInit {
  A1=0;
  B1=0;
  C1=0;
  D1=0;
  E1=0;
  F1=0;

  A2=0;
  B2=0;
  C2=0;
  D2=0;
  E2=0;
  F2=0;

  A3=0;
  B3=0;
  C3=0;
  D3=0;
  E3=0;
  F3=0;

  A4=0;
  B4=0;
  C4=0;
  D4=0;
  E4=0;
  F4=0;
  
  A5=0;
  B5=0;
  C5=0;
  D5=0;
  E5=0;
  F5=0;

  isDisabledA1=false;
  isDisabledB1=false;
  isDisabledC1=false;
  isDisabledD1=false;
  isDisabledE1=false;
  isDisabledF1=false;

  isDisabledA2=false;
  isDisabledB2=false;
  isDisabledC2=false;
  isDisabledD2=false;
  isDisabledE2=false;
  isDisabledF2=false;

  isDisabledA3=false;
  isDisabledB3=false;
  isDisabledC3=false;
  isDisabledD3=false;
  isDisabledE3=false;
  isDisabledF3=false;

  isDisabledA4=false;
  isDisabledB4=false;
  isDisabledC4=false;
  isDisabledD4=false;
  isDisabledE4=false;
  isDisabledF4=false;

  isDisabledA5=false;
  isDisabledB5=false;
  isDisabledC5=false;
  isDisabledD5=false;
  isDisabledE5=false;
  isDisabled=false;

  seatA1:any|undefined;
  seatB1:any|undefined;
  seatC1:any|undefined;
  seatD1:any|undefined;
  seatE1:any|undefined;
  seatF1:any|undefined;

  seatA2:any|undefined;
  seatB2:any|undefined;
  seatC2:any|undefined;
  seatD2:any|undefined;
  seatE2:any|undefined;
  seatF2:any|undefined;

  seatA3:any|undefined;
  seatB3:any|undefined;
  seatC3:any|undefined;
  seatD3:any|undefined;
  seatE3:any|undefined;
  seatF3:any|undefined;

  seatA4:any|undefined;
  seatB4:any|undefined;
  seatC4:any|undefined;
  seatD4:any|undefined;
  seatE4:any|undefined;
  seatF4:any|undefined;

  seatA5:any|undefined;
  seatB5:any|undefined;
  seatC5:any|undefined;
  seatD5:any|undefined;
  seatE5:any|undefined;
  seat:any|undefined;
  
  constructor(private route:Router) { }
  select(A1:number,B1:number,C1:number,D1:number,E1:number,F1:number,A2:number,B2:number,C2:number,D2:number,E2:number,F2:number,A3:number,B3:number,C3:number,D3:number,E3:number,F3:number,A4:number,B4:number,C4:number,D4:number,E4:number,F4:number,A5:number,B5:number,C5:number,D5:number,E5:number,F5:number){ 
    
    if(A1==1){
      this.isDisabledA1=true;
      sessionStorage.setItem("bookA1",JSON.stringify(this.isDisabledA1));
    }

if(A2==1){
      this.isDisabledA2=true;
      sessionStorage.setItem("bookA2",JSON.stringify(this.isDisabledA2));
    }

if(A3==1){
      this.isDisabledA3=true;
      sessionStorage.setItem("bookA3",JSON.stringify(this.isDisabledA3));
    }

if(A4==1){
      this.isDisabledA4=true;
      sessionStorage.setItem("bookA4",JSON.stringify(this.isDisabledA4));
    }

if(A5==1){
      this.isDisabledA5=true;
      sessionStorage.setItem("bookA5",JSON.stringify(this.isDisabledA5));
    }

if(B1==1){
      this.isDisabledB1=true;
      sessionStorage.setItem("bookB1",JSON.stringify(this.isDisabledB1));
    }

if(B2==1){
      this.isDisabledB2=true;
      sessionStorage.setItem("bookB2",JSON.stringify(this.isDisabledB2));
    }

if(B3==1){
      this.isDisabledB3=true;
      sessionStorage.setItem("bookB3",JSON.stringify(this.isDisabledB3));
    }

if(B4==1){
      this.isDisabledB4=true;
      sessionStorage.setItem("bookB4",JSON.stringify(this.isDisabledB4));
    }

if(B5==1){
      this.isDisabledB5=true;
      sessionStorage.setItem("bookB5",JSON.stringify(this.isDisabledB5));
    }

if(C1==1){
      this.isDisabledC1=true;
      sessionStorage.setItem("bookC1",JSON.stringify(this.isDisabledC1));
    }

if(C2==1){
      this.isDisabledC2=true;
      sessionStorage.setItem("bookC2",JSON.stringify(this.isDisabledC2));
    }

if(C3==1){
      this.isDisabledC3=true;
      sessionStorage.setItem("bookC3",JSON.stringify(this.isDisabledC3));
    }

if(C4==1){
      this.isDisabledA4=true;
      sessionStorage.setItem("bookC4",JSON.stringify(this.isDisabledC4));
    }

if(C5==1){
      this.isDisabledC5=true;
      sessionStorage.setItem("bookC5",JSON.stringify(this.isDisabledC5));
    }

if(D1==1){
      this.isDisabledD1=true;
      sessionStorage.setItem("bookD1",JSON.stringify(this.isDisabledD1));
    }

if(D2==1){
      this.isDisabledD2=true;
      sessionStorage.setItem("bookD2",JSON.stringify(this.isDisabledD2));
    }

if(D3==1){
      this.isDisabledD3=true;
      sessionStorage.setItem("bookD3",JSON.stringify(this.isDisabledD3));
    }

if(D4==1){
      this.isDisabledD4=true;
      sessionStorage.setItem("bookD4",JSON.stringify(this.isDisabledD4));
    }

if(D5==1){
      this.isDisabledD5=true;
      sessionStorage.setItem("bookD5",JSON.stringify(this.isDisabledD5));
    }

if(E1==1){
      this.isDisabledE1=true;
      sessionStorage.setItem("bookE1",JSON.stringify(this.isDisabledE1));
    }

if(E2==1){
      this.isDisabledE2=true;
      sessionStorage.setItem("bookE2",JSON.stringify(this.isDisabledE2));
    }

if(E3==1){
      this.isDisabledE3=true;
      sessionStorage.setItem("bookE3",JSON.stringify(this.isDisabledE3));
    }

if(E4==1){
      this.isDisabledE4=true;
      sessionStorage.setItem("bookE4",JSON.stringify(this.isDisabledE4));
    }

if(E5==1){
      this.isDisabledE5=true;
      sessionStorage.setItem("bookE5",JSON.stringify(this.isDisabledE5));
    }

if(F1==1){
      this.isDisabledF1=true;
      sessionStorage.setItem("bookF1",JSON.stringify(this.isDisabledF1));
    }

if(F2==1){
      this.isDisabledF2=true;
      sessionStorage.setItem("bookF2",JSON.stringify(this.isDisabledF2));
    }

if(F3==1){
      this.isDisabledF3=true;
      sessionStorage.setItem("bookF3",JSON.stringify(this.isDisabledF3));
    }

if(F4==1){
      this.isDisabledF4=true;
      sessionStorage.setItem("bookF4",JSON.stringify(this.isDisabledF4));
    }
    
    if(F5==1){
      this.isDisabled=true;
      sessionStorage.setItem("book",JSON.stringify(this.isDisabled));
    }
  this.route.navigate(["/payment"]);
  }

  ngOnInit(): void {
   this.seatA1=sessionStorage.getItem("bookA1");
   this.isDisabledA1=JSON.parse(this.seatA1);

   this.seatB1=sessionStorage.getItem("bookB1");
   this.isDisabledB1=JSON.parse(this.seatB1);

   this.seatC1=sessionStorage.getItem("bookC1");
   this.isDisabledC1=JSON.parse(this.seatC1);

   this.seatD1=sessionStorage.getItem("bookD1");
   this.isDisabledD1=JSON.parse(this.seatD1);

   this.seatE1=sessionStorage.getItem("bookE1");
   this.isDisabledE1=JSON.parse(this.seatE1);

   this.seatF1=sessionStorage.getItem("bookF1");
   this.isDisabledF1=JSON.parse(this.seatF1);

   this.seatA2=sessionStorage.getItem("bookA2");
   this.isDisabledA2=JSON.parse(this.seatA2);

   this.seatB2=sessionStorage.getItem("bookB2");
   this.isDisabledB2=JSON.parse(this.seatB2);

   this.seatC2=sessionStorage.getItem("bookC2");
   this.isDisabledC2=JSON.parse(this.seatC2);

   this.seatD2=sessionStorage.getItem("bookD2");
   this.isDisabledD2=JSON.parse(this.seatD2);

   this.seatE2=sessionStorage.getItem("bookE2");
   this.isDisabledE2=JSON.parse(this.seatE2);

   this.seatF2=sessionStorage.getItem("bookF2");
   this.isDisabledF2=JSON.parse(this.seatF2);

   this.seatA3=sessionStorage.getItem("bookA3");
   this.isDisabledA3=JSON.parse(this.seatA3);

   this.seatB3=sessionStorage.getItem("bookB3");
   this.isDisabledB3=JSON.parse(this.seatB3);

   this.seatC3=sessionStorage.getItem("bookC3");
   this.isDisabledC3=JSON.parse(this.seatC3);

   this.seatD3=sessionStorage.getItem("bookD3");
   this.isDisabledD3=JSON.parse(this.seatD3);

   this.seatE3=sessionStorage.getItem("bookE3");
   this.isDisabledE3=JSON.parse(this.seatE3);

   this.seatF3=sessionStorage.getItem("bookF3");
   this.isDisabledF3=JSON.parse(this.seatF3);

   this.seatA4=sessionStorage.getItem("bookA4");
  this.isDisabledA4=JSON.parse(this.seatA4);

  this.seatB4=sessionStorage.getItem("bookB4");
  this.isDisabledB4=JSON.parse(this.seatB4);

  this.seatC4=sessionStorage.getItem("bookC4");
  this.isDisabledC4=JSON.parse(this.seatC4);

  this.seatD4=sessionStorage.getItem("bookD4");
  this.isDisabledD4=JSON.parse(this.seatD4);

  this.seatE4=sessionStorage.getItem("bookE4");
  this.isDisabledE4=JSON.parse(this.seatE4);

  this.seatF4=sessionStorage.getItem("bookF4");
  this.isDisabledF4=JSON.parse(this.seatF4);

   this.seatA5=sessionStorage.getItem("bookA5");
   this.isDisabledA5=JSON.parse(this.seatA5);

   this.seatB5=sessionStorage.getItem("bookB5");
   this.isDisabledB5=JSON.parse(this.seatB5);

   this.seatC5=sessionStorage.getItem("bookC5");
   this.isDisabledC5=JSON.parse(this.seatC5);

   this.seatD5=sessionStorage.getItem("bookD5");
   this.isDisabledD5=JSON.parse(this.seatD5);

   this.seatE5=sessionStorage.getItem("bookE5");
   this.isDisabledE5=JSON.parse(this.seatE5);

   this.seat=sessionStorage.getItem("book");
   this.isDisabled=JSON.parse(this.seat);
    }
}
