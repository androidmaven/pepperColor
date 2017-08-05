# pepperColor
PepperColor is a developer color assistant for smooth and easy app design. (Pepper color app coming soon)

You don't have to think of colors in HEX much, pepperColor handles most things to start create colorful design
following the material color design guidelines and beyond. It removes boilerplate codes for colors. 

- PepperColor comes with fully inbuilt list of material colors you can use in your XML and JAVA as well as Kotlin
just by calling it.
- You can create gradients with just 1(one) line of code instantly.
- Get creative by creating you own blend of color with only 1 or two lines of code.
- You also can set transparency and shades programmatically to your colors very easily.


# ADDING TO YOUR PROJECT
```Java


dependencies { 
     compile 'com.oluwatobi.android:peppercolor:2.0'
     }

 COMPILE WITH MAVEN
<dependency>
  <groupId>com.oluwatobi.android</groupId>
  <artifactId>peppercolor</artifactId>
  <version>2.0</version>
  <type>pom</type>
</dependency>

 COMPILE WITH IVY
<dependency org='com.oluwatobi.android' name='peppercolor' rev='2.0'>
  <artifact name='peppercolorjava' ext='pom' ></artifact>
</dependency>

```

# HOW TO USE PEPPERCOLOR FOR ANDROID.

USING XML
Its very easy..just by calling it normally using the PPR prefix, and you get list of colors.
Example:
```

 android:background="@color/PPR_AMBER200"
```
where AMBER is the color name. and 200 is the shade. Allowing to choose from several shades of colors.

 USING JAVA
 ```
To get list of colors, use - e.g PepperColors.BLUE400.
For single colors, use - new PepperSingleColors().start(params) or new PepperSingleColors.Builder()
For gradients, use - new PepperGradient.Builder()
For Blends, use -  PepperBlend.Builder()
```

FOR SINGLE COLORS (example)
1st method
```
setBackgroundColor(new PepperSingleColor().start(PepperColors.ORANGE800)); 
setBackgroundColor(new PepperSingleColor().start(PepperColors.ORANGE800, int transparency));
```

2nd method
```
setBackgroundColor(new PepperSingleColor.Builder().setColor(PepperColors.PINK100).setTransparency(40).build());
```


NOTE - Transparency should be within in 5, 10, 15,20 -- 100.

FOR GRADIENTS 
```
setBackground(new PepperGradient().start(PepperColors.ORANGE100
                            ,PepperColors.GREEN400,
                            GradientDrawable.Orientation.TR_BL
                            ,GradientDrawable.LINEAR_GRADIENT
                            ));
                            ```

WHERE A. (GradientShape is optional : default - GradientDrawable.LINEAR_GRADIENT)
      B. (GradientOrientation is optional : default - Gradient.Orienatation.TR_BL).
      
      
FOR BLENDS
Method 1 -
```
setBackgroundColor(new PepperBlend().start(PepperColors.GREEN200,PepperColors.AMBER600, 0.8f));
```
Method 2 -
``` java
setBackgroundColor(new PepperBlend.Builder()
.setColorOne(PepperColors.BLUE700)
.setColorTwo(PepperColors.DEEP_PURPLE100)
.setRatio(0.4f)
.build());
```

NOTE : setRatio is optional : default - 0.2f

USING KOTLIN
Same procedure can be followed.

Copyright 2017 Oluwatobi Akinpel

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.



