# Gloxey Custom Font Views

![alt text](https://github.com/adnanbinmustafa/Gloxey-custom-font-views/blob/master/screenshot.png "Gloxey Custom Font Views")

This library aims to use multiple Fonts via XML on android views.
Currently supported views are
1. **Button**
2. **TextView**
3. **EditText**
4. **RadioButton**
5. **CheckBox**
6. **Switch**
7. **SwitchCompat**
8. **CheckedTextView**
9. **ToggleButton**

# How to use?


Create folder **assets** -> **fonts**. Copy your fonts into **fonts** folder.
Use property **app : font_name = "font_name_string"** to apply font on view.
    
    
    <!--Font Names-->
    <string name="aadhunik">aadhunik.ttf</string>
    <string name="kung_fool">kungfool.ttf</string>
    <string name="skrova">skrova.otf</string>
    <string name="painting_in_the_sun_light">painting_in_the_sun_light.ttf</string>

    
#### Example    

    <io.gloxey.cfv.CFTextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="Aadhunik"
            android:textColor="#ff00"
            android:textSize="40sp"
            app:font_name="@string/aadhunik" />


    <io.gloxey.cfv.CFButton
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Kung Fool"
            android:textColor="#154748"
            app:font_name="@string/kung_fool" />

    <io.gloxey.cfv.CFEditText
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="Hello world"
            android:textSize="30sp"
            app:font_name="@string/skrova" />
          
    <io.gloxey.cfv.CFCheckBox
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:text="Painting In The Sun Light"
            android:textSize="30sp"
            app:font_name="@string/painting_in_the_sun_light" />
            
  #### Gradle Dependency
            dependencies{
                   compile 'io.gloxey.cfv:custom-font-views:1.0.2'
            }

       
