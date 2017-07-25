package asif167.com.knowyourfactsp10;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class frag2 extends Fragment {

    Button btnChange;
    ImageView img;
    String imageUrl;

    ArrayList<String> alImg = new ArrayList<>();
    int count = 0;

    public frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag2, container, false);

        btnChange = (Button) view.findViewById(R.id.btnChngImg);
        img = (ImageView) view.findViewById(R.id.myZoomageView);

        imageUrl = "http://square.github.io/picasso/static/sample.png";

        Picasso.with(getActivity().getApplicationContext()).load(imageUrl).into(img);

        alImg.add("http://68.media.tumblr.com/62657f5f957d96f4c7fa5541409f1701/tumblr_otktnjRQxA1roqv59o1_500.png");
        alImg.add("http://68.media.tumblr.com/33cecc0406816321229af632d5818584/tumblr_otm06gfTXa1roqv59o1_500.png");
        alImg.add("http://square.github.io/picasso/static/sample.png");

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int index = rand.nextInt(3);
                imageUrl = alImg.get(index).toString();
                Picasso.with(getActivity().getApplicationContext()).load(imageUrl).into(img);

//                }


//                if(imageUrl.equalsIgnoreCase("http://68.media.tumblr.com/62657f5f957d96f4c7fa5541409f1701/tumblr_otktnjRQxA1roqv59o1_500.png")){
//                    imageUrl = "http://68.media.tumblr.com/33cecc0406816321229af632d5818584/tumblr_otm06gfTXa1roqv59o1_500.png";
//                    Picasso.with(getActivity().getApplicationContext()).load(imageUrl).into(img);
//                }else if(imageUrl.equalsIgnoreCase("http://68.media.tumblr.com/33cecc0406816321229af632d5818584/tumblr_otm06gfTXa1roqv59o1_500.png")){
//                    imageUrl = "http://68.media.tumblr.com/62657f5f957d96f4c7fa5541409f1701/tumblr_otktnjRQxA1roqv59o1_500.png";
//                    Picasso.with(getActivity().getApplicationContext()).load(imageUrl).into(img);
//                }else{
//                    imageUrl = "http://68.media.tumblr.com/62657f5f957d96f4c7fa5541409f1701/tumblr_otktnjRQxA1roqv59o1_500.png";
//                    Picasso.with(getActivity().getApplicationContext()).load(imageUrl).into(img);
//                }
            }

//            }
        });


        return view;
    }

}
