import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-radar',
  templateUrl: './radar.component.html',
  styleUrls: ['./radar.component.css']
})
export class RadarComponent implements OnInit {
  radars: any=[];

  constructor(private http: HttpClient) { 
    this.http.get('http://localhost:9000/RADAR-SERVICE/query/radars').subscribe(data => {
      this.radars = data;
    }
    );
  }

  ngOnInit(): void {
  }

}
