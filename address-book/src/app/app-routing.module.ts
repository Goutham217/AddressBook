import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UpdateallcontactsComponent } from './contacts/updateallcontacts/updateallcontacts.component';
import { ViewallcontactsComponent } from './contacts/viewallcontacts/viewallcontacts.component';


const routes: Routes = [

  { path: "viewallcontacts", component: ViewallcontactsComponent},
  { path: "updateallcontacts", component: UpdateallcontactsComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
