/**
 * Created by unamanic on 10/11/16.
 */
(function(){
    angular.module('eulerApp')
        .controller('menuCtrl', ['$scope','questionService',function($scope, questionService){
            $scope.questions = [];

            var q = questionService.getQuestions()

            q.$promise.then(function(data){
                $scope.questions = data._embedded.questions;
            });
        }]);
})();