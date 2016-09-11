yet-another-heroku-spring-boot-example [![build](https://travis-ci.org/daggerok/yet-another-heroku-spring-boot-example.svg?branch=master)](https://travis-ci.org/daggerok/yet-another-heroku-spring-boot-example)
======================================

```fish
heroku login

heroku apps
=== My Apps
some-words-numbers

heroku apps:destroy --app some-words-numbers

git init
touch Procfile
heroku apps:create daggerok
git push heroku master
... wait for ....
heroku open # or open https://daggerok.herokuapp.com
```
