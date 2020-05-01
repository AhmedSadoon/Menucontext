package com.example.menucontextual;

import android.content.Context;
import android.view.MenuItem;
import android.widget.Toast;

public class PopupMenuEvent implements android.widget.PopupMenu.OnMenuItemClickListener{

   Context context;
   public PopupMenuEvent(Context context){
       this .context=context;
   }
    @Override
    public boolean onMenuItemClick(MenuItem item) {

       if(item.getItemId()==R.id.id_Admin)
       {
           Toast.makeText(context,"you are admin",Toast.LENGTH_SHORT).show();
           return true;
       }

        else if(item.getItemId()==R.id.id_User)
        {
            Toast.makeText(context,"you are User",Toast.LENGTH_SHORT).show();
            return true;

        }
        else{
            return false;
       }

    }
}
