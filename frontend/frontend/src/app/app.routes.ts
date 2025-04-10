import { Routes } from '@angular/router';
import { LoginPageComponent } from './components/login-page/login-page.component';
import { HomeComponent } from './components/home/home.component';
import { ManModalGrupoComponent } from './components/grupo/man-modal-grupo/man-modal-grupo.component';
import { ListNormasComponent } from './components/grupo/list-normas/list-normas.component';

export const routes: Routes = [

    {
        path: '',
        component: HomeComponent,
        title: 'Verificar Normas'
    }
    ,{
        path: 'register',
        component: LoginPageComponent,
        title: 'Register'
    },
    {
        path: 'groups',
        component: ManModalGrupoComponent,
        title: 'Group Management'
    },
    {
        path:'normas',
        component: ListNormasComponent,
        title: 'List Normas'
    }
];
