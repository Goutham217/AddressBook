import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'updateallcontacts',
  templateUrl: './updateallcontacts.component.html',
  styleUrls: ['./updateallcontacts.component.css']
})
export class UpdateallcontactsComponent implements OnInit {

  // newContact: User = {

  //   userId: 0,
  //   firstName: '',
  //   lastName: '',
  //   email:'',
  // }

  constructor() {}

  ngOnInit(): void {
  }

//   updateEmpInfo(){

//     this.contacts-httpservice.updateEmpInformation(this.newContact).subscribe((response)=>{
      
//       alert("Contact Updated!");
//     })

// }
  }