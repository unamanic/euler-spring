/**
 * Created by unamanic on 10/11/16.
 */
(function(){
    angular.module('eulerApp')
        .controller('problemCtrl', ['$scope', '$routeParams', 'problemService',
            function($scope, $routeParams, problemService){
                $scope.problem = $routeParams.problem;

                $scope.question = '';
                $scope.limit = null;
                $scope.time = null;
                $scope.answer = null;

                problemService.fetchProblem($scope.problem)
                    .then(function(data){
                        $scope.question = data.question;
                    }, function (data) {
                        $scope.question = "There was a problem loading the question";
                    });

                $scope.run = function(){
                    problemService.fetchAnswer($scope.problem, $scope.limit)
                        .then(function(data){
                            $scope.time = data.time;
                            $scope.answer = data.answer;
                        }, function (data) {
                            $scope.question = "There was a problem loading the answer";
                        });
                }

        }]);
})();