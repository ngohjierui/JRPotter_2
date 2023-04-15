import { Component } from '@angular/core';

@Component({
  selector: 'app-about-me',
  templateUrl: './about-me.component.html',
  styleUrls: ['./about-me.component.css']
})
export class AboutMeComponent {
  profile: Profile = {
    name: 'Jerry Ngoh',
    title: 'Software Developer',
    bio: 'Junior developer learning how to code',
    imageUrl: 'https://picsum.photos/200'
  };
}

export interface Profile {
  name: string;
  title: string;
  bio: string;
  imageUrl: string;
}