angular.module('kickstopper', ['ngRoute', 'angular-loading-bar', 'restangular'])
  .config(function($routeProvider, $locationProvider, RestangularProvider) {

    $routeProvider
      .when('/', {
        templateUrl: 'templates/main.html',
        controller: 'MainCtrl'
      })
      .when('/projects', {
        templateUrl: 'templates/projects.html',
        controller: 'ProjectsCtrl'
      })
      .when('/project/:projectId', {
        templateUrl: 'templates/project.html',
        controller: 'ProjectCtrl'
      });

    $locationProvider.html5Mode(true);

    RestangularProvider.setBaseUrl('http://10.0.0.233:8080');
  })
  .controller('MainCtrl', function($scope, $location) {
    $scope.searchQuery = '';
    $scope.doSearch = function() {
      if($scope.searchQuery) {
        $location.path('/projects').search({q: $scope.searchQuery});
      }
    }
  })
  .controller('ProjectsCtrl', function($scope, $routeParams, $location, Restangular) {
    if(!$routeParams.q) {
      $location.path('/').search({});
    }

    $scope.projects = [
      {
        id: 0,
        name: 'First Project Name',
        by: 'Creator Name',
        img: 'img/photo-original.jpg',
        kickstarter: {
          backers: 0,
          money: 0,
          goal: 0,
          days: 0
        },
        kickstopper: {
          backers: 0,
          money: 0
        }
      },
      {
        id: 1,
        name: 'Second Project Name',
        by: 'Creator Name',
        img: 'img/photo-original.jpg',
        kickstarter: {
          backers: 0,
          money: 0,
          goal: 0,
          days: 0
        },
        kickstopper: {
          backers: 0,
          money: 0
        }
      },
      {
        id: 2,
        name: 'Third Project Name',
        by: 'Creator Name',
        img: 'img/photo-original.jpg',
        kickstarter: {
          backers: 0,
          money: 0,
          goal: 0,
          days: 0
        },
        kickstopper: {
          backers: 0,
          money: 0
        }
      }
    ];

    Restangular.all('projects').customGET('', {q: $routeParams.q}).then(function(res) {
      $scope.projects = res.projects;
    }, function(res) {
      console.log(res);
    });
  })
  .controller('ProjectCtrl', function($scope, $routeParams, Restangular) {
    $scope.stopButton = function() {
      console.log('yes');
    };

    $scope.project = {
      id: 0,
      name: 'Project Name',
      by: 'Creator Name',
      img: 'img/photo-original.jpg',
      kickstarter: {
        backers: 0,
        money: 0,
        goal: 0,
        days: 0
      },
      kickstopper: {
        backers: 0,
        money: 0
      }
    };

    Restangular.all('projects').get($routeParams.projectId).then(function(res) {
      $scope.project = res.plain();
    }, function(res) {
      console.log(res);
    });
  });
