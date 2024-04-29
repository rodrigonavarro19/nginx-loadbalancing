import { Routes } from '@angular/router';

export const routes: Routes = [
    {
        path: "usuarios",
        loadComponent: () => import("./usuarios/usuarios.component"),
    },
    {
        path:'**', redirectTo: "usuarios",
    }
];
