import { Component } from '@angular/core';
import { TapeComponent } from './components/tape/tape.component';
import { FooterComponent } from "./components/footer/footer.component";
import { RouterModule } from '@angular/router';
import { HeaderComponent } from "./components/header/header.component";

@Component({
  selector: 'app-root',
  imports: [RouterModule, HeaderComponent, TapeComponent, FooterComponent, HeaderComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'frontend';
}
