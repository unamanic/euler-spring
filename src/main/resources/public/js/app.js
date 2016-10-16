/**
 * Created by unamanic on 10/9/16.
 */
(function(){
    angular.module('eulerApp', ['ngRoute', 'ngResource', 'hateoas'])
        .constant('questionUrl', 'questions')
        .config(['$routeProvider', 'HateoasInterceptorProvider',function ($routeProvider, HateoasInterceptorProvider) {
            HateoasInterceptorProvider.transformAllResponses();
            $routeProvider
                .when("/problem/:problem",{templateUrl:"views/problem.html"})
                .otherwise({templateUrl: "views/menu.html"});
        }])
        .controller('defaultCtrl', ['$scope', function($scope){
            $scope.appName = 'Project Euler Spring Boot Application';
        }]);
})();