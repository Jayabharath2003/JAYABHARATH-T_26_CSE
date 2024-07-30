import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
//export class AppComponent{
//name : string;
//age : number;
//email : string;
//imagepath:string;
//fname:string;

//constructor() {
//this.name = "JB";
//this.age = 20;
//this.email = "jayabharath3600@gmail.com";
//this.imagepath="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTjF-YaB-qnLqCfS1gRnuKSuzew0Db06tuZYSwGgvPe-om9tOwAu1WEIH3WRw&s";
//this.fname="";
//}
//ChangeName(){
 // this.name="Jayabharath";
//}
//ChangeAge(){
  //this.age=21;
//}
//ChangeEmail(){
//  this.email="jb@gmail.com";
//}
//ChangeImage(){
//  this.imagepath="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRmgKdYXF10TIGkBICCUr6NI0bKohwUcChKjcXwBpUxBLeG9idP6KOBlAvIw&s"
//}
//}
export class AppComponent {
  flag : boolean;
  vehicles:string[];
  selectedVehicle:string;
  myStyle:{};
  myClass:string;
  
  constructor() {
  this.flag = true;
  this.vehicles=["TwoWheeler","ThreeWheeler","FourWheeler"];
  this.selectedVehicle="";
  this.myStyle={'width':'40%','border':'2px solid green','border-radius':'25px'};
  this.myClass="MyClass1";
  }
  changeFlag() {
  this.flag = ! this.flag;
  }
  setSelectedItem(vec:string){
    this.selectedVehicle=vec;
  }
  changeStyle(){
    this.myStyle={'width':'40%','border':'2px solid red','border-radius':'25px'};
  }
}

