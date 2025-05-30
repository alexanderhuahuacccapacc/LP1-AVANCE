import { Injectable } from '@angular/core';
import {GenericService} from './generic.service';
import {UnidadMedida} from '../modelo/UnidadMedida';
import {HttpClient} from '@angular/common/http';
import {environment} from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UnidadmedidaService extends GenericService<UnidadMedida>{

  constructor(protected override http:HttpClient) {
    super(http, `${environment.HOST}/unidadmedidas`);
  }

}
