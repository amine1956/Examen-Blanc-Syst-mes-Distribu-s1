import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-prioritaire',
  templateUrl: './prioritaire.component.html',
  styleUrls: ['./prioritaire.component.css']
})
export class PrioritaireComponent implements OnInit {
  prioritaires: any=[];

  constructor(private http: HttpClient   ) {
    this.http.get('http://localhost:9000/IMMATRICULATION-SERVICE/query/vehicules').subscribe(data => {
      this.prioritaires = data;
    }
    );
   }

  ngOnInit(): void {
  }

}

