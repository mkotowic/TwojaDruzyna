import { Component, OnInit } from '@angular/core';
import { ApiService } from '../common/api/api.service';

@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.css']
})
export class FeedbackComponent implements OnInit {
  model: FeedbackViewModel = {
    author: '',
    email: '',
    phoneNumber: '',
    content: ''
  };

  constructor(private api: ApiService) {
  }

  ngOnInit() {
  }

  sendFeedback(): void {
    this.api.sendFeedback(this.model).subscribe(
      res => {
        location.reload();
      },
      err => {
        alert('Bład podczas wysyłki maila');
      }
    );
  }

}

export interface FeedbackViewModel {
  author: string;
  email: string;
  phoneNumber: string;
  content: string;
}