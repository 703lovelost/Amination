# Лабораторная №4 - Анимация

Метод активации анимации:

```java
ImageView img = (ImageView)findViewById(R.id.animationView);
        img.setBackgroundResource(R.drawable.rabbit_animation);
        AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
        frameAnimation.setOneShot(false);
        Button buttonStart = (Button) findViewById(R.id.buttonStart);
        Button buttonStop = (Button) findViewById(R.id.buttonStop);

        buttonStart.setOnClickListener(v -> {
            frameAnimation.start();
        });

        buttonStop.setOnClickListener(v -> {
            frameAnimation.stop();
        });
```

Скриншот приложения и apk-фай включены.
