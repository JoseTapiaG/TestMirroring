package cl.josemanuel.testmirroring;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import github.ankyl.castscreen.CastScreenActivity;

public class MainActivity extends CastScreenActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main, menu);
        MenuItem castButtonMenuItem = menu.findItem(R.id.media_route_menu_item);
        super.prepareCastButton(castButtonMenuItem, "70D04A1B");
        return true;
    }
}
