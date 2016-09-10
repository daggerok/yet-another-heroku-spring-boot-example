heroku java
===========

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
heroku open # or open https:/daggerok.heroku.com
```

