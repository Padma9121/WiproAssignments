import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, NgForm } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { MatCardModule } from '@angular/material/card';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, FormsModule, MatInputModule, MatButtonModule, MatCardModule],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Feedback Form';

  feedback = {
    name: '',
    email: '',
    subject: '',
    comments: ''
  };

  submitted = false;

  onSubmit(form: NgForm) {
    if (form.valid) {
      this.submitted = true;
      console.log(this.feedback);
      form.resetForm();
    }
  }
}
