'use strict';

/* Tarefa Controllers */


function TarefaListCtrl($scope, $location, Tarefa){
    
    $scope.tarefas = Tarefa.query();
    
    $scope.newTarefa = function(){
        $location.path('/nova')
    };
    
    $scope.deleteTarefa = function(tarefa){
        tarefa.$delete({
            'id':tarefa.id
        }, function (){
            $scope.tarefas = Tarefa.query();
            $locations.path('/');
        });
    };
    
}

function TarefaEditCtrl($scope, $routeParams, $location, Tarefa){
    
}

function TarefaNewCtrl($scope, $location, Tarefa){
    
    $scope.saveTarefa = function(tarefa){
        Tarefa.save($scope.tarefa, function(tarefa){
            $location.path('/')
        });
    };
    
}