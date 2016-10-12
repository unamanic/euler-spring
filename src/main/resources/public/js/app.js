/**
 * Created by unamanic on 10/9/16.
 */
(function(){
    angular.module('eulerApp', ['ngRoute'])
        .config(function ($routeProvider) {
            $routeProvider
                .when("/problem/:problem",{templateUrl:"views/problem.html"})
                .otherwise({templateUrl: "views/menu.html"});
        })
        .controller('defaultCtrl', ['$scope', function($scope){
            $scope.appName = 'Project Euler Spring Boot Application';
        }]);
})();