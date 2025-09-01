import { Injectable } from '@angular/core';
import {GenericService} from './generic.service';
import {UnidadMedida} from '../modelo/UnidadMedida';
import {Marca} from '../modelo/Marca';
import {HttpClient} from '@angular/common/http';
import {environment} from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class MarcaService extends GenericService<Marca>{

  constructor(protected override http:HttpClient) {
    super(http, `${environment.HOST}/marcas`);
  }
}
