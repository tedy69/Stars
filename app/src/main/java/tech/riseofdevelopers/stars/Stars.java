package tech.riseofdevelopers.stars;

import android.os.Parcel;
import android.os.Parcelable;

public class Stars implements Parcelable {

    private String name;
    private String detail;
    private int foto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.foto);
        dest.writeString(this.detail);
    }

    public Stars() {
    }

    protected Stars(Parcel in) {
        this.name = in.readString();
        this.foto = in.readInt();
        this.detail = in.readString();
    }

    public static final Parcelable.Creator<Stars> CREATOR = new Parcelable.Creator<Stars>() {
        @Override
        public Stars createFromParcel(Parcel source) {
            return new Stars(source);
        }

        @Override
        public Stars[] newArray(int size) {
            return new Stars[size];
        }
    };

}


