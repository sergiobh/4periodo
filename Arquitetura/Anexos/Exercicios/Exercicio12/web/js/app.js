'use strict';

/* App Module */

angular.module('App', ['ServicoTarefa'])
    .config(function ($routeProvider){
        $routeProvider
        .when('/',{
            controller: TarefaListCtrl,
            templateUrl: 'template/tarefa-lista.html'
        })
        
        .when('/nova',{
            controller: TarefaNewCtrl,
            templateUrl: 'template/tarefa-detalhe.html'
        })
        
        .when('/:id',{
            controller: TarefaEditCtrl,
            templateUrl: 'template/tarefa-detalhe.html'           
        })
        
        .otherwise({
            redirectTo: '/'
        });
    });