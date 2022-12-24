import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PrioritaireComponent } from './prioritaire/prioritaire.component';
import { RadarComponent } from './radar/radar.component';

const routes: Routes = [
  {
    path: "radar",
    component: RadarComponent
  },
  { 
    path: 'priotaire',
    component: PrioritaireComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
