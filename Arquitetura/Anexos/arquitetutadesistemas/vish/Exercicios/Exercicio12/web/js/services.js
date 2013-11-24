'use strict';

/* Services */

angular.module('ServicoTarefa', ['ngResource'])
    .factory('Tarefa', ['$resource', '$http',
        function($resource, $http){
            return $resource('api/tarefa/:id', {},{
                
                save:{
                    method:'POST'
                },
                
                query:{
                    method:'GET',
                    isArray:true
                },
                
                remove:{
                    method: 'DELETE'
                }
                
                
                });
        }
        ]);