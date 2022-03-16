# AvatarView :adult:
Avatar View Android-Kotlin Example App<br />

1- Dependencies<br />
```
    //AvatarView
    implementation "io.getstream:avatarview-coil:1.0.3"
```
2- Layout<br />
```
        <io.getstream.avatarview.AvatarView
        android:id="@+id/avatarView"
        android:layout_width="110dp"
        android:layout_height="110dp"
        app:avatarViewBorderColor="@color/purple_200"
        app:avatarViewBorderWidth="3dp"
        app:avatarViewIndicatorBorderColor="@color/white"
        app:avatarViewIndicatorBorderSizeCriteria="10"
        app:avatarViewIndicatorColor="#76DD7B"
        app:avatarViewIndicatorEnabled="true"
        app:avatarViewIndicatorPosition="bottomRight"
        app:avatarViewIndicatorSizeCriteria="9"
        app:avatarViewInitialsTextStyle="bold"
        app:avatarViewShape="circle"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
 ```
        
3- Activity<br />
```
avatarView.loadImage("image")
```
* Output :
<img src="https://github.com/melihkarakilinc/AvatarView/blob/master/ss/ss.png" width="30%" height="30%">
