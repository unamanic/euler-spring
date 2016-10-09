/**
 * Created by unamanic on 10/9/16.
 */
(function(){
    angular.module('eulerApp', [])
        .controller('defaultCtrl', ['$scope', function($scope){
            $scope.appName = 'Project Euler Spring Boot Application';
        }]);
})();