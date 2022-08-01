import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { contacts } from 'src/app/contacts.model';
import { HttpService } from 'src/app/http.service';

@Component({
  selector: 'viewallcontacts',
  templateUrl: './viewallcontacts.component.html',
  styleUrls: ['./viewallcontacts.component.css']
})
export class ViewallcontactsComponent implements OnInit {

  viewContacts: contacts[];

  constructor(private activatedRoute: ActivatedRoute,
    private router: Router, private httpService: HttpService) {this.viewContacts = []; }

  ngOnInit(): void {

    let eIdParam = this.activatedRoute.snapshot.paramMap.get('eID');
    this.httpService.getAllContacts().subscribe((response) => {
      this.viewContacts = response;
    });
  }

}
